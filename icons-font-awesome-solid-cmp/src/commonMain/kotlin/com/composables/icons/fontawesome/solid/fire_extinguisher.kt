package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FireExtinguisher: ImageVector
    get() {
        if (_FireExtinguisher != null) return _FireExtinguisher!!
        
        _FireExtinguisher = ImageVector.Builder(
            name = "fire-extinguisher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(434.027f, 26.329f)
                lineToRelative(-168f, 28f)
                curveTo(254.693f, 56.218f, 256f, 67.8f, 256f, 72f)
                horizontalLineToRelative(-58.332f)
                curveTo(208.353f, 36.108f, 181.446f, 0f, 144f, 0f)
                curveToRelative(-39.435f, 0f, -66.368f, 39.676f, -52.228f, 76.203f)
                curveToRelative(-52.039f, 13.051f, -75.381f, 54.213f, -90.049f, 90.884f)
                curveToRelative(-4.923f, 12.307f, 1.063f, 26.274f, 13.37f, 31.197f)
                curveToRelative(12.317f, 4.926f, 26.279f, -1.075f, 31.196f, -13.37f)
                curveTo(75.058f, 112.99f, 106.964f, 120f, 168f, 120f)
                verticalLineToRelative(27.076f)
                curveToRelative(-41.543f, 10.862f, -72f, 49.235f, -72f, 94.129f)
                verticalLineTo(488f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(144f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(240f)
                curveToRelative(0f, -44.731f, -30.596f, -82.312f, -72f, -92.97f)
                verticalLineTo(120f)
                horizontalLineToRelative(40f)
                curveToRelative(0f, 2.974f, -1.703f, 15.716f, 10.027f, 17.671f)
                lineToRelative(168f, 28f)
                curveTo(441.342f, 166.89f, 448f, 161.25f, 448f, 153.834f)
                verticalLineTo(38.166f)
                curveToRelative(0f, -7.416f, -6.658f, -13.056f, -13.973f, -11.837f)
                close()
                moveTo(144f, 72f)
                curveToRelative(-8.822f, 0f, -16f, -7.178f, -16f, -16f)
                reflectiveCurveToRelative(7.178f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.178f, 16f, 16f)
                reflectiveCurveToRelative(-7.178f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _FireExtinguisher!!
    }

private var _FireExtinguisher: ImageVector? = null

