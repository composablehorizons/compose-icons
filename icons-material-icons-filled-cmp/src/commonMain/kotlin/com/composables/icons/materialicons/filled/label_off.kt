package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Label_off: ImageVector
    get() {
        if (_Label_off != null) return _Label_off!!
        
        _Label_off = ImageVector.Builder(
            name = "label_off",
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
                moveTo(3.25f, 2.75f)
                lineToRelative(17f, 17f)
                lineTo(19f, 21f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, 0.23f, -1.05f, 0.59f, -1.41f)
                lineTo(2f, 4f)
                lineToRelative(1.25f, -1.25f)
                close()
                moveTo(22f, 12f)
                lineToRelative(-4.37f, -6.16f)
                curveTo(17.27f, 5.33f, 16.67f, 5f, 16f, 5f)
                horizontalLineTo(8f)
                lineToRelative(11f, 11f)
                lineToRelative(3f, -4f)
                close()
            }
        }.build()
        
        return _Label_off!!
    }

private var _Label_off: ImageVector? = null

