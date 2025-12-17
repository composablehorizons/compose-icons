package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Airport_shuttle: ImageVector
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
                curveToRelative(0f, 1.65f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0f, 1.65f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                horizontalLineTo(23f)
                verticalLineToRelative(-5f)
                lineToRelative(-6f, -6f)
                close()
                moveTo(3f, 11f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineTo(3f)
                close()
                moveToRelative(3f, 6.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveToRelative(7f, -6.5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(4.5f, 6.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15f, 11f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.build()
        
        return _Airport_shuttle!!
    }

private var _Airport_shuttle: ImageVector? = null

