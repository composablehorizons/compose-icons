package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Flare: ImageVector
    get() {
        if (_Flare != null) return _Flare!!
        
        _Flare = ImageVector.Builder(
            name = "flare",
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
                moveTo(5.644f, 7.05f)
                lineTo(7.05f, 5.645f)
                lineToRelative(2.123f, 2.122f)
                lineToRelative(-1.408f, 1.407f)
                close()
                moveTo(11f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(5.242f, 13.834f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.406f, 1.408f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(14.834f, 7.76f)
                lineToRelative(2.12f, -2.123f)
                lineToRelative(1.41f, 1.407f)
                lineToRelative(-2.123f, 2.122f)
                close()
                moveToRelative(-5.668f, 8.482f)
                lineToRelative(-2.122f, 2.12f)
                lineToRelative(-1.407f, -1.406f)
                lineToRelative(2.122f, -2.122f)
                close()
                moveTo(12f, 9f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
                moveToRelative(-1f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(1f, 11f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                close()
                moveToRelative(16f, 0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _Flare!!
    }

private var _Flare: ImageVector? = null

