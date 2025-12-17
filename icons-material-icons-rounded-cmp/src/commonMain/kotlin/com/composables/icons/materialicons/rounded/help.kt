package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Help: ImageVector
    get() {
        if (_Help != null) return _Help!!
        
        _Help = ImageVector.Builder(
            name = "help",
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
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(1f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2.07f, -7.75f)
                lineToRelative(-0.9f, 0.92f)
                curveToRelative(-0.5f, 0.51f, -0.86f, 0.97f, -1.04f, 1.69f)
                curveToRelative(-0.08f, 0.32f, -0.13f, 0.68f, -0.13f, 1.14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.46f, 0.08f, -0.9f, 0.22f, -1.31f)
                curveToRelative(0.2f, -0.58f, 0.53f, -1.1f, 0.95f, -1.52f)
                lineToRelative(1.24f, -1.26f)
                curveToRelative(0.46f, -0.44f, 0.68f, -1.1f, 0.55f, -1.8f)
                curveToRelative(-0.13f, -0.72f, -0.69f, -1.33f, -1.39f, -1.53f)
                curveToRelative(-1.11f, -0.31f, -2.14f, 0.32f, -2.47f, 1.27f)
                curveToRelative(-0.12f, 0.37f, -0.43f, 0.65f, -0.82f, 0.65f)
                horizontalLineToRelative(-0.3f)
                curveTo(8.4f, 9f, 8f, 8.44f, 8.16f, 7.88f)
                curveToRelative(0.43f, -1.47f, 1.68f, -2.59f, 3.23f, -2.83f)
                curveToRelative(1.52f, -0.24f, 2.97f, 0.55f, 3.87f, 1.8f)
                curveToRelative(1.18f, 1.63f, 0.83f, 3.38f, -0.19f, 4.4f)
                close()
            }
        }.build()
        
        return _Help!!
    }

private var _Help: ImageVector? = null

