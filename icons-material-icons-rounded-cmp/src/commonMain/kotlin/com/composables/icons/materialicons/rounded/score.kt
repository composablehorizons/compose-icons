package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Score: ImageVector
    get() {
        if (_Score != null) return _Score!!
        
        _Score = ImageVector.Builder(
            name = "score",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-7f, 2.75f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(8f)
                lineToRelative(1.79f, -2.69f)
                curveToRelative(0.13f, -0.19f, 0.35f, -0.31f, 0.59f, -0.31f)
                curveToRelative(0.56f, 0f, 0.9f, 0.63f, 0.59f, 1.1f)
                lineTo(15.2f, 8f)
                lineToRelative(1.27f, 1.9f)
                curveToRelative(0.31f, 0.47f, -0.02f, 1.1f, -0.59f, 1.1f)
                curveToRelative(-0.24f, 0f, -0.46f, -0.12f, -0.59f, -0.31f)
                lineTo(13.5f, 8f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                close()
                moveToRelative(-5f, 2.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(7.75f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveTo(7.34f, 5f, 7.75f, 5f)
                horizontalLineTo(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.75f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(8.25f)
                close()
                moveToRelative(11.74f, 5.01f)
                lineToRelative(-5.03f, 5.03f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineTo(9f, 15f)
                lineToRelative(-2.49f, 2.49f)
                curveToRelative(-0.56f, 0.56f, -1.51f, 0.16f, -1.51f, -0.62f)
                curveToRelative(0f, -0.23f, 0.09f, -0.46f, 0.26f, -0.62f)
                lineToRelative(3.03f, -3.03f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineTo(13f, 16.5f)
                lineToRelative(4.49f, -4.49f)
                curveToRelative(0.56f, -0.56f, 1.51f, -0.16f, 1.51f, 0.62f)
                curveToRelative(0f, 0.24f, -0.09f, 0.46f, -0.26f, 0.63f)
                close()
            }
        }.build()
        
        return _Score!!
    }

private var _Score: ImageVector? = null

