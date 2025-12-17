package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Thumb_down: ImageVector
    get() {
        if (_Thumb_down != null) return _Thumb_down!!
        
        _Thumb_down = ImageVector.Builder(
            name = "thumb_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 3f)
                horizontalLineTo(6f)
                curveToRelative(-0.83f, 0f, -1.54f, 0.5f, -1.84f, 1.22f)
                lineToRelative(-3.02f, 7.05f)
                curveToRelative(-0.09f, 0.23f, -0.14f, 0.47f, -0.14f, 0.73f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6.31f)
                lineToRelative(-0.95f, 4.57f)
                lineToRelative(-0.03f, 0.32f)
                curveToRelative(0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f)
                lineTo(9.83f, 23f)
                lineToRelative(6.59f, -6.59f)
                curveToRelative(0.36f, -0.36f, 0.58f, -0.86f, 0.58f, -1.41f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(4f, 0f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(4f)
                verticalLineTo(3f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Thumb_down!!
    }

private var _Thumb_down: ImageVector? = null

