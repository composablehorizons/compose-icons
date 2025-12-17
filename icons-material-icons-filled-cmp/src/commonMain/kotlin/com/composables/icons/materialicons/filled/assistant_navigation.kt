package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Assistant_navigation: ImageVector
    get() {
        if (_Assistant_navigation != null) return _Assistant_navigation!!
        
        _Assistant_navigation = ImageVector.Builder(
            name = "assistant_navigation",
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
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveToRelative(3.57f, 16f)
                lineTo(12f, 15.42f)
                lineTo(8.43f, 17f)
                lineToRelative(-0.37f, -0.37f)
                lineTo(12f, 7f)
                lineToRelative(3.95f, 9.63f)
                lineToRelative(-0.38f, 0.37f)
                close()
            }
        }.build()
        
        return _Assistant_navigation!!
    }

private var _Assistant_navigation: ImageVector? = null

