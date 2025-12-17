package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Pray: ImageVector
    get() {
        if (_Pray != null) return _Pray!!
        
        _Pray = ImageVector.Builder(
            name = "pray",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 128f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                reflectiveCurveTo(291.35f, 0f, 256f, 0f)
                reflectiveCurveToRelative(-64f, 28.65f, -64f, 64f)
                reflectiveCurveToRelative(28.65f, 64f, 64f, 64f)
                close()
                moveToRelative(-30.63f, 169.75f)
                curveToRelative(14.06f, 16.72f, 39f, 19.09f, 55.97f, 5.22f)
                lineToRelative(88f, -72.02f)
                curveToRelative(17.09f, -13.98f, 19.59f, -39.19f, 5.62f, -56.28f)
                curveToRelative(-13.97f, -17.11f, -39.19f, -19.59f, -56.31f, -5.62f)
                lineToRelative(-57.44f, 47f)
                lineToRelative(-38.91f, -46.31f)
                curveToRelative(-15.44f, -18.39f, -39.22f, -27.92f, -64f, -25.33f)
                curveToRelative(-24.19f, 2.48f, -45.25f, 16.27f, -56.37f, 36.92f)
                lineToRelative(-49.37f, 92.03f)
                curveToRelative(-23.4f, 43.64f, -8.69f, 96.37f, 34.19f, 123.75f)
                lineTo(131.56f, 432f)
                horizontalLineTo(40f)
                curveToRelative(-22.09f, 0f, -40f, 17.91f, -40f, 40f)
                reflectiveCurveToRelative(17.91f, 40f, 40f, 40f)
                horizontalLineToRelative(208f)
                curveToRelative(34.08f, 0f, 53.77f, -42.79f, 28.28f, -68.28f)
                lineTo(166.42f, 333.86f)
                lineToRelative(34.8f, -64.87f)
                lineToRelative(24.15f, 28.76f)
                close()
            }
        }.build()
        
        return _Pray!!
    }

private var _Pray: ImageVector? = null

