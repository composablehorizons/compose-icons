package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Wb_twighlight: ImageVector
    get() {
        if (_Wb_twighlight != null) return _Wb_twighlight!!
        
        _Wb_twighlight = ImageVector.Builder(
            name = "wb_twighlight",
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
                moveTo(16.954f, 8.66f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(-2.13f, 2.12f)
                close()
                moveTo(17.9f, 14f)
                curveToRelative(-0.5f, -2.85f, -2.95f, -5f, -5.9f, -5f)
                reflectiveCurveToRelative(-5.45f, 2.15f, -5.9f, 5f)
                horizontalLineToRelative(11.8f)
                close()
                moveTo(2f, 16f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(4f)
                horizontalLineTo(2f)
                close()
                moveToRelative(9f, -12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3.54f, 7.925f)
                lineTo(4.954f, 6.51f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(-1.415f, 1.415f)
                close()
            }
        }.build()
        
        return _Wb_twighlight!!
    }

private var _Wb_twighlight: ImageVector? = null

