package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Airport_shuttle: ImageVector
    get() {
        if (_Airport_shuttle != null) return _Airport_shuttle!!
        
        _Airport_shuttle = ImageVector.Builder(
            name = "airport_shuttle",
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
                moveTo(3f, 14f)
                horizontalLineToRelative(0.78f)
                curveToRelative(0.55f, -0.61f, 1.34f, -1f, 2.22f, -1f)
                reflectiveCurveToRelative(1.67f, 0.39f, 2.22f, 1f)
                horizontalLineToRelative(7.56f)
                curveToRelative(0.55f, -0.61f, 1.34f, -1f, 2.22f, -1f)
                reflectiveCurveToRelative(1.67f, 0.39f, 2.22f, 1f)
                horizontalLineTo(21f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 5f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.89f, -2f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                lineToRelative(-6f, -6f)
                close()
                moveToRelative(-2f, 2f)
                horizontalLineToRelative(1f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineTo(7f)
                close()
                moveTo(9f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                close()
                moveTo(3f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                close()
                moveToRelative(3f, 10.25f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                close()
                moveToRelative(12f, 0f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-0.78f)
                curveToRelative(-0.55f, -0.61f, -1.34f, -1f, -2.22f, -1f)
                reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1f)
                horizontalLineTo(8.22f)
                curveToRelative(-0.55f, -0.61f, -1.33f, -1f, -2.22f, -1f)
                reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Airport_shuttle!!
    }

private var _Airport_shuttle: ImageVector? = null

