package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.GrinWink: ImageVector
    get() {
        if (_GrinWink != null) return _GrinWink!!
        
        _GrinWink = ImageVector.Builder(
            name = "grin-wink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(328f, 180f)
                curveToRelative(-25.69f, 0f, -55.88f, 16.92f, -59.86f, 42.12f)
                curveToRelative(-1.75f, 11.22f, 11.5f, 18.24f, 19.83f, 10.84f)
                lineToRelative(9.55f, -8.48f)
                curveToRelative(14.81f, -13.19f, 46.16f, -13.19f, 60.97f, 0f)
                lineToRelative(9.55f, 8.48f)
                curveToRelative(8.48f, 7.43f, 21.56f, 0.25f, 19.83f, -10.84f)
                curveTo(383.88f, 196.92f, 353.69f, 180f, 328f, 180f)
                close()
                moveToRelative(-160f, 60f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                close()
                moveToRelative(185.55f, 64.64f)
                curveToRelative(-25.93f, 8.3f, -64.4f, 13.06f, -105.55f, 13.06f)
                reflectiveCurveToRelative(-79.62f, -4.75f, -105.55f, -13.06f)
                curveToRelative(-9.94f, -3.13f, -19.4f, 5.37f, -17.71f, 15.34f)
                curveTo(132.67f, 367.13f, 196.06f, 400f, 248f, 400f)
                reflectiveCurveToRelative(115.33f, -32.87f, 123.26f, -80.02f)
                curveToRelative(1.68f, -9.89f, -7.67f, -18.48f, -17.71f, -15.34f)
                close()
                moveTo(248f, 8f)
                curveTo(111.03f, 8f, 0f, 119.03f, 0f, 256f)
                reflectiveCurveToRelative(111.03f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.03f, 248f, -248f)
                reflectiveCurveTo(384.97f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-110.28f, 0f, -200f, -89.72f, -200f, -200f)
                reflectiveCurveTo(137.72f, 56f, 248f, 56f)
                reflectiveCurveToRelative(200f, 89.72f, 200f, 200f)
                reflectiveCurveToRelative(-89.72f, 200f, -200f, 200f)
                close()
            }
        }.build()
        
        return _GrinWink!!
    }

private var _GrinWink: ImageVector? = null

