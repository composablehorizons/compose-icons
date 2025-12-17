package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StarAndCrescent: ImageVector
    get() {
        if (_StarAndCrescent != null) return _StarAndCrescent!!
        
        _StarAndCrescent = ImageVector.Builder(
            name = "star-and-crescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340.47f, 466.36f)
                curveToRelative(-1.45f, 0f, -6.89f, 0.46f, -9.18f, 0.46f)
                curveToRelative(-116.25f, 0f, -210.82f, -94.57f, -210.82f, -210.82f)
                reflectiveCurveTo(215.04f, 45.18f, 331.29f, 45.18f)
                curveToRelative(2.32f, 0f, 7.7f, 0.46f, 9.18f, 0.46f)
                curveToRelative(7.13f, 0f, 13.33f, -5.03f, 14.75f, -12.07f)
                curveToRelative(1.46f, -7.25f, -2.55f, -14.49f, -9.47f, -17.09f)
                curveTo(316.58f, 5.54f, 286.39f, 0f, 256f, 0f)
                curveTo(114.84f, 0f, 0f, 114.84f, 0f, 256f)
                reflectiveCurveToRelative(114.84f, 256f, 256f, 256f)
                curveToRelative(30.23f, 0f, 60.28f, -5.49f, 89.32f, -16.32f)
                curveToRelative(5.96f, -2.02f, 10.28f, -7.64f, 10.28f, -14.26f)
                curveToRelative(0f, -8.09f, -6.39f, -15.06f, -15.13f, -15.06f)
                close()
                moveToRelative(162.99f, -252.5f)
                lineToRelative(-76.38f, -11.1f)
                lineToRelative(-34.16f, -69.21f)
                curveToRelative(-1.83f, -3.7f, -5.38f, -5.55f, -8.93f, -5.55f)
                reflectiveCurveToRelative(-7.1f, 1.85f, -8.93f, 5.55f)
                lineToRelative(-34.16f, 69.21f)
                lineToRelative(-76.38f, 11.1f)
                curveToRelative(-8.17f, 1.18f, -11.43f, 11.22f, -5.52f, 16.99f)
                lineToRelative(55.27f, 53.87f)
                lineToRelative(-13.05f, 76.07f)
                curveToRelative(-1.11f, 6.44f, 4.01f, 11.66f, 9.81f, 11.66f)
                curveToRelative(1.53f, 0f, 3.11f, -0.36f, 4.64f, -1.17f)
                lineTo(384f, 335.37f)
                lineToRelative(68.31f, 35.91f)
                curveToRelative(1.53f, 0.8f, 3.11f, 1.17f, 4.64f, 1.17f)
                curveToRelative(5.8f, 0f, 10.92f, -5.23f, 9.81f, -11.66f)
                lineToRelative(-13.05f, -76.07f)
                lineToRelative(55.27f, -53.87f)
                curveToRelative(5.91f, -5.77f, 2.65f, -15.81f, -5.52f, -16.99f)
                close()
            }
        }.build()
        
        return _StarAndCrescent!!
    }

private var _StarAndCrescent: ImageVector? = null

