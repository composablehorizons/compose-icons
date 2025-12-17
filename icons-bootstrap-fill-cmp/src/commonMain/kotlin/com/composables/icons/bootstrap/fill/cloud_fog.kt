package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CloudFog: ImageVector
    get() {
        if (_CloudFog != null) return _CloudFog!!
        
        _CloudFog = ImageVector.Builder(
            name = "cloud-fog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(10.405f, -9.473f)
                arcToRelative(5.001f, 5.001f, 0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0f, true, false, 3.5f, 12f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, false, false, 0.405f, -5.973f)
            }
        }.build()
        
        return _CloudFog!!
    }

private var _CloudFog: ImageVector? = null

