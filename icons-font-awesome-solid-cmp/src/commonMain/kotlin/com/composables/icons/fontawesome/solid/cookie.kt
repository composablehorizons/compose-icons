package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Cookie: ImageVector
    get() {
        if (_Cookie != null) return _Cookie!!
        
        _Cookie = ImageVector.Builder(
            name = "cookie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(510.37f, 254.79f)
                lineToRelative(-12.08f, -76.26f)
                arcToRelative(132.493f, 132.493f, 0f, false, false, -37.16f, -72.95f)
                lineToRelative(-54.76f, -54.75f)
                curveToRelative(-19.73f, -19.72f, -45.18f, -32.7f, -72.71f, -37.05f)
                lineToRelative(-76.7f, -12.15f)
                curveToRelative(-27.51f, -4.36f, -55.69f, 0.11f, -80.52f, 12.76f)
                lineTo(107.32f, 49.6f)
                arcToRelative(132.25f, 132.25f, 0f, false, false, -57.79f, 57.8f)
                lineToRelative(-35.1f, 68.88f)
                arcToRelative(132.602f, 132.602f, 0f, false, false, -12.82f, 80.94f)
                lineToRelative(12.08f, 76.27f)
                arcToRelative(132.493f, 132.493f, 0f, false, false, 37.16f, 72.95f)
                lineToRelative(54.76f, 54.75f)
                arcToRelative(132.087f, 132.087f, 0f, false, false, 72.71f, 37.05f)
                lineToRelative(76.7f, 12.14f)
                curveToRelative(27.51f, 4.36f, 55.69f, -0.11f, 80.52f, -12.75f)
                lineToRelative(69.12f, -35.21f)
                arcToRelative(132.302f, 132.302f, 0f, false, false, 57.79f, -57.8f)
                lineToRelative(35.1f, -68.87f)
                curveToRelative(12.71f, -24.96f, 17.2f, -53.3f, 12.82f, -80.96f)
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
        
        return _Cookie!!
    }

private var _Cookie: ImageVector? = null

