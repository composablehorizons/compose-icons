package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sledding: ImageVector
    get() {
        if (_Sledding != null) return _Sledding!!
        
        _Sledding = ImageVector.Builder(
            name = "sledding",
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
                moveTo(14f, 4.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveTo(14f, 3.4f, 14f, 4.5f)
                close()
                moveTo(17.22f, 17.9f)
                lineToRelative(1.93f, 0.63f)
                lineToRelative(-0.46f, 1.43f)
                lineToRelative(-3.32f, -1.08f)
                lineTo(14.9f, 20.3f)
                lineToRelative(3.32f, 1.08f)
                lineToRelative(0f, 0f)
                curveToRelative(1.31f, 0.43f, 2.72f, -0.29f, 3.15f, -1.61f)
                curveToRelative(0.43f, -1.31f, -0.29f, -2.72f, -1.61f, -3.15f)
                lineToRelative(0.46f, -1.43f)
                curveToRelative(2.1f, 0.68f, 3.25f, 2.94f, 2.57f, 5.04f)
                curveToRelative(-0.68f, 2.1f, -2.94f, 3.25f, -5.04f, 2.57f)
                horizontalLineToRelative(0f)
                lineTo(1f, 17.36f)
                lineToRelative(0.46f, -1.43f)
                lineToRelative(3.93f, 1.28f)
                lineToRelative(0.46f, -1.43f)
                lineTo(1.93f, 14.5f)
                lineToRelative(0.46f, -1.43f)
                lineTo(4f, 13.6f)
                verticalLineTo(9.5f)
                lineToRelative(5.47f, -2.35f)
                curveToRelative(0.39f, -0.17f, 0.84f, -0.21f, 1.28f, -0.07f)
                curveToRelative(0.95f, 0.31f, 1.46f, 1.32f, 1.16f, 2.27f)
                lineToRelative(-1.05f, 3.24f)
                lineTo(14.5f, 12f)
                lineTo(17.22f, 17.9f)
                close()
                moveTo(6f, 14.25f)
                lineToRelative(0.48f, 0.16f)
                lineToRelative(0.75f, -2.31f)
                lineTo(7.92f, 10f)
                lineTo(6f, 10.82f)
                verticalLineTo(14.25f)
                close()
                moveTo(13.94f, 18.41f)
                lineToRelative(-6.66f, -2.16f)
                lineToRelative(-0.46f, 1.43f)
                lineToRelative(6.66f, 2.16f)
                lineTo(13.94f, 18.41f)
                close()
                moveTo(14.63f, 17.05f)
                lineToRelative(-1.18f, -2.56f)
                lineToRelative(-3.97f, 0.89f)
                lineTo(14.63f, 17.05f)
                close()
            }
        }.build()
        
        return _Sledding!!
    }

private var _Sledding: ImageVector? = null

