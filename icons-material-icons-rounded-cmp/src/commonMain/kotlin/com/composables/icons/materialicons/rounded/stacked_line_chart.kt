package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Stacked_line_chart: ImageVector
    get() {
        if (_Stacked_line_chart != null) return _Stacked_line_chart!!
        
        _Stacked_line_chart = ImageVector.Builder(
            name = "stacked_line_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.79f, 14.78f)
                lineTo(2.7f, 14.69f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(6.09f, -6.1f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(6.39f, -7.18f)
                curveToRelative(0.38f, -0.43f, 1.05f, -0.44f, 1.45f, -0.04f)
                lineToRelative(0f, 0f)
                curveToRelative(0.37f, 0.38f, 0.39f, 0.98f, 0.04f, 1.37f)
                lineToRelative(-7.17f, 8.07f)
                curveToRelative(-0.38f, 0.43f, -1.04f, 0.45f, -1.45f, 0.04f)
                lineTo(9.5f, 9.48f)
                lineToRelative(-5.3f, 5.3f)
                curveTo(3.82f, 15.17f, 3.18f, 15.17f, 2.79f, 14.78f)
                close()
                moveTo(4.2f, 20.78f)
                lineToRelative(5.3f, -5.3f)
                lineToRelative(3.25f, 3.25f)
                curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f)
                lineToRelative(7.17f, -8.07f)
                curveToRelative(0.35f, -0.39f, 0.33f, -0.99f, -0.04f, -1.37f)
                lineToRelative(0f, 0f)
                curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f)
                lineToRelative(-6.39f, 7.18f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-6.09f, 6.1f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0.09f, 0.09f)
                curveTo(3.18f, 21.17f, 3.82f, 21.17f, 4.2f, 20.78f)
                close()
            }
        }.build()
        
        return _Stacked_line_chart!!
    }

private var _Stacked_line_chart: ImageVector? = null

