package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CookieBite: ImageVector
    get() {
        if (_CookieBite != null) return _CookieBite!!
        
        _CookieBite = ImageVector.Builder(
            name = "cookie-bite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(510.52f, 255.82f)
                curveToRelative(-69.97f, -0.85f, -126.47f, -57.69f, -126.47f, -127.86f)
                curveToRelative(-70.17f, 0f, -127f, -56.49f, -127.86f, -126.45f)
                curveToRelative(-27.26f, -4.14f, -55.13f, 0.3f, -79.72f, 12.82f)
                lineToRelative(-69.13f, 35.22f)
                arcToRelative(132.221f, 132.221f, 0f, false, false, -57.79f, 57.81f)
                lineToRelative(-35.1f, 68.88f)
                arcToRelative(132.645f, 132.645f, 0f, false, false, -12.82f, 80.95f)
                lineToRelative(12.08f, 76.27f)
                arcToRelative(132.521f, 132.521f, 0f, false, false, 37.16f, 72.96f)
                lineToRelative(54.77f, 54.76f)
                arcToRelative(132.036f, 132.036f, 0f, false, false, 72.71f, 37.06f)
                lineToRelative(76.71f, 12.15f)
                curveToRelative(27.51f, 4.36f, 55.7f, -0.11f, 80.53f, -12.76f)
                lineToRelative(69.13f, -35.21f)
                arcToRelative(132.273f, 132.273f, 0f, false, false, 57.79f, -57.81f)
                lineToRelative(35.1f, -68.88f)
                curveToRelative(12.56f, -24.64f, 17.01f, -52.58f, 12.91f, -79.91f)
                close()
                moveTo(176f, 368f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
                moveToRelative(32f, -160f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
                moveToRelative(160f, 128f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _CookieBite!!
    }

private var _CookieBite: ImageVector? = null

