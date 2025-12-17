package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Running: ImageVector
    get() {
        if (_Running != null) return _Running!!
        
        _Running = ImageVector.Builder(
            name = "running",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 416f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(272f, 96f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                reflectiveCurveTo(298.51f, 0f, 272f, 0f)
                reflectiveCurveToRelative(-48f, 21.49f, -48f, 48f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                close()
                moveTo(113.69f, 317.47f)
                lineToRelative(-14.8f, 34.52f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(77.45f)
                curveToRelative(19.25f, 0f, 36.58f, -11.44f, 44.11f, -29.09f)
                lineToRelative(8.79f, -20.52f)
                lineToRelative(-10.67f, -6.3f)
                curveToRelative(-17.32f, -10.23f, -30.06f, -25.37f, -37.99f, -42.61f)
                close()
                moveTo(384f, 223.99f)
                horizontalLineToRelative(-44.03f)
                lineToRelative(-26.06f, -53.25f)
                curveToRelative(-12.5f, -25.55f, -35.45f, -44.23f, -61.78f, -50.94f)
                lineToRelative(-71.08f, -21.14f)
                curveToRelative(-28.3f, -6.8f, -57.77f, -0.55f, -80.84f, 17.14f)
                lineToRelative(-39.67f, 30.41f)
                curveToRelative(-14.03f, 10.75f, -16.69f, 30.83f, -5.92f, 44.86f)
                reflectiveCurveToRelative(30.84f, 16.66f, 44.86f, 5.92f)
                lineToRelative(39.69f, -30.41f)
                curveToRelative(7.67f, -5.89f, 17.44f, -8f, 25.27f, -6.14f)
                lineToRelative(14.7f, 4.37f)
                lineToRelative(-37.46f, 87.39f)
                curveToRelative(-12.62f, 29.48f, -1.31f, 64.01f, 26.3f, 80.31f)
                lineToRelative(84.98f, 50.17f)
                lineToRelative(-27.47f, 87.73f)
                curveToRelative(-5.28f, 16.86f, 4.11f, 34.81f, 20.97f, 40.09f)
                curveToRelative(3.19f, 1f, 6.41f, 1.48f, 9.58f, 1.48f)
                curveToRelative(13.61f, 0f, 26.23f, -8.77f, 30.52f, -22.45f)
                lineToRelative(31.64f, -101.06f)
                curveToRelative(5.91f, -20.77f, -2.89f, -43.08f, -21.64f, -54.39f)
                lineToRelative(-61.24f, -36.14f)
                lineToRelative(31.31f, -78.28f)
                lineToRelative(20.27f, 41.43f)
                curveToRelative(8f, 16.34f, 24.92f, 26.89f, 43.11f, 26.89f)
                horizontalLineTo(384f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -31.99f, -32f, -31.99f)
                close()
            }
        }.build()
        
        return _Running!!
    }

private var _Running: ImageVector? = null

