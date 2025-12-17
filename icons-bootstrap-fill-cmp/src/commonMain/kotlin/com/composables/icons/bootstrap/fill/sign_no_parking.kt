package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignNoParking: ImageVector
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
                moveTo(13.292f, 14f)
                arcTo(8f, 8f, 0f, false, true, 2f, 2.707f)
                lineToRelative(3.5f, 3.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.283f)
                verticalLineTo(9.164f)
                horizontalLineToRelative(1.674f)
                close()
                moveToRelative(0.708f, -0.708f)
                lineToRelative(-4.37f, -4.37f)
                curveTo(10.5f, 8.524f, 11f, 7.662f, 11f, 6.587f)
                curveToRelative(0f, -1.482f, -0.955f, -2.584f, -2.538f, -2.584f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(0.79f)
                lineTo(2.708f, 2.002f)
                arcTo(8f, 8f, 0f, false, true, 14f, 13.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.777f, 7.485f)
                verticalLineToRelative(0.59f)
                horizontalLineToRelative(0.59f)
                close()
                moveToRelative(1.949f, 0.535f)
                lineTo(6.777f, 6.07f)
                verticalLineToRelative(-0.966f)
                horizontalLineTo(8.27f)
                curveToRelative(0.893f, 0f, 1.419f, 0.539f, 1.419f, 1.482f)
                curveToRelative(0f, 0.769f, -0.35f, 1.273f, -0.963f, 1.433f)
                close()
            }
        }.build()
        
        return _SignNoParking!!
    }

private var _SignNoParking: ImageVector? = null

