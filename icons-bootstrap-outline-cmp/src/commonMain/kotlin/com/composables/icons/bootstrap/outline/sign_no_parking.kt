package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignNoParking: ImageVector
    get() {
        if (_SignNoParking != null) return _SignNoParking!!
        
        _SignNoParking = ImageVector.Builder(
            name = "sign-no-parking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveToRelative(5.29f, -3.416f)
                lineTo(9.63f, 8.923f)
                curveTo(10.5f, 8.523f, 11f, 7.66f, 11f, 6.586f)
                curveToRelative(0f, -1.482f, -0.955f, -2.584f, -2.538f, -2.584f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(0.79f)
                lineTo(3.416f, 2.71f)
                arcToRelative(7f, 7f, 0f, false, true, 9.874f, 9.874f)
                moveToRelative(-0.706f, 0.707f)
                arcTo(7f, 7f, 0f, false, true, 2.71f, 3.417f)
                lineToRelative(2.79f, 2.79f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.283f)
                verticalLineTo(9.164f)
                horizontalLineToRelative(1.674f)
                close()
                moveTo(8.726f, 8.019f)
                lineTo(6.777f, 6.07f)
                verticalLineToRelative(-0.966f)
                horizontalLineTo(8.27f)
                curveToRelative(0.893f, 0f, 1.419f, 0.539f, 1.419f, 1.482f)
                curveToRelative(0f, 0.769f, -0.35f, 1.273f, -0.963f, 1.433f)
                moveToRelative(-1.949f, -0.534f)
                lineToRelative(0.59f, 0.59f)
                horizontalLineToRelative(-0.59f)
                close()
            }
        }.build()
        
        return _SignNoParking!!
    }

private var _SignNoParking: ImageVector? = null

