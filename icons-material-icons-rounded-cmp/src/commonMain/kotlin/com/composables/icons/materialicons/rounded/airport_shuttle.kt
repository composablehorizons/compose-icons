package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Airport_shuttle: ImageVector
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
                moveTo(22.41f, 10.41f)
                lineToRelative(-4.83f, -4.83f)
                curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.89f, -2f, 2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2.17f)
                curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.42f)
                close()
                moveTo(3f, 10f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveToRelative(3f, 7.25f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                close()
                moveTo(13f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(5f, 6.25f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
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

