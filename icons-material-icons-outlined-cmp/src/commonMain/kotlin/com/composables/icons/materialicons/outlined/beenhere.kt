package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Beenhere: ImageVector
    get() {
        if (_Beenhere != null) return _Beenhere!!
        
        _Beenhere = ImageVector.Builder(
            name = "beenhere",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 1f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(3f, 15.93f)
                curveToRelative(0f, 0.69f, 0.35f, 1.3f, 0.88f, 1.66f)
                lineTo(12f, 23f)
                lineToRelative(8.11f, -5.41f)
                curveToRelative(0.53f, -0.36f, 0.88f, -0.97f, 0.88f, -1.66f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-7f, 19.6f)
                lineToRelative(-7f, -4.66f)
                verticalLineTo(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(12.93f)
                lineToRelative(-7f, 4.67f)
                close()
                moveToRelative(-2.01f, -7.42f)
                lineToRelative(-2.58f, -2.59f)
                lineTo(6f, 12f)
                lineToRelative(4f, 4f)
                lineToRelative(8f, -8f)
                lineToRelative(-1.42f, -1.42f)
                close()
            }
        }.build()
        
        return _Beenhere!!
    }

private var _Beenhere: ImageVector? = null

