package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SearchPlus: ImageVector
    get() {
        if (_SearchPlus != null) return _SearchPlus!!
        
        _SearchPlus = ImageVector.Builder(
            name = "search-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(304f, 192f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-32f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-56f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(32f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(56f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
                moveToRelative(201f, 284.7f)
                lineTo(476.7f, 505f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0f)
                lineTo(343f, 405.3f)
                curveToRelative(-4.5f, -4.5f, -7f, -10.6f, -7f, -17f)
                verticalLineTo(372f)
                curveToRelative(-35.3f, 27.6f, -79.7f, 44f, -128f, 44f)
                curveTo(93.1f, 416f, 0f, 322.9f, 0f, 208f)
                reflectiveCurveTo(93.1f, 0f, 208f, 0f)
                reflectiveCurveToRelative(208f, 93.1f, 208f, 208f)
                curveToRelative(0f, 48.3f, -16.4f, 92.7f, -44f, 128f)
                horizontalLineToRelative(16.3f)
                curveToRelative(6.4f, 0f, 12.5f, 2.5f, 17f, 7f)
                lineToRelative(99.7f, 99.7f)
                curveToRelative(9.3f, 9.4f, 9.3f, 24.6f, 0f, 34f)
                close()
                moveTo(344f, 208f)
                curveToRelative(0f, -75.2f, -60.8f, -136f, -136f, -136f)
                reflectiveCurveTo(72f, 132.8f, 72f, 208f)
                reflectiveCurveToRelative(60.8f, 136f, 136f, 136f)
                reflectiveCurveToRelative(136f, -60.8f, 136f, -136f)
                close()
            }
        }.build()
        
        return _SearchPlus!!
    }

private var _SearchPlus: ImageVector? = null

