package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CloudFog2: ImageVector
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
                moveTo(8.5f, 3f)
                arcToRelative(5f, 5f, 0f, false, true, 4.905f, 4.027f)
                arcTo(3f, 3f, 0f, false, true, 13f, 13f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(1.05f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -0.713f, -1f)
                horizontalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(0.035f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(0.337f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.57f, -1.977f)
                arcTo(5f, 5f, 0f, false, true, 8.5f, 3f)
            }
        }.build()
        
        return _CloudFog2!!
    }

private var _CloudFog2: ImageVector? = null

