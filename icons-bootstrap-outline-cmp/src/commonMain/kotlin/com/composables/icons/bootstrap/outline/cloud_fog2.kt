package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudFog2: ImageVector
    get() {
        if (_CloudFog2 != null) return _CloudFog2!!
        
        _CloudFog2 = ImageVector.Builder(
            name = "cloud-fog2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 4f)
                arcToRelative(4f, 4f, 0f, false, false, -3.8f, 2.745f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.949f, -0.313f)
                arcToRelative(5.002f, 5.002f, 0f, false, true, 9.654f, 0.595f)
                arcTo(3f, 3f, 0f, false, true, 13f, 13f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(13f)
                arcToRelative(2f, 2f, 0f, false, false, 0.001f, -4f)
                horizontalLineToRelative(-0.026f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.445f)
                arcTo(4f, 4f, 0f, false, false, 8.5f, 4f)
                moveTo(0f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 8f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _CloudFog2!!
    }

private var _CloudFog2: ImageVector? = null

