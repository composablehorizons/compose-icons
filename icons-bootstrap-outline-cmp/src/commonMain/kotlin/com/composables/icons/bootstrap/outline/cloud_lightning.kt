package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudLightning: ImageVector
    get() {
        if (_CloudLightning != null) return _CloudLightning!!
        
        _CloudLightning = ImageVector.Builder(
            name = "cloud-lightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.405f, 4.027f)
                arcToRelative(5.001f, 5.001f, 0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0f, true, false, 3.5f, 10f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, false, false, 0.405f, -5.973f)
                moveTo(8.5f, 1f)
                arcToRelative(4f, 4f, 0f, false, true, 3.976f, 3.555f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.445f)
                horizontalLineTo(13f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                horizontalLineTo(3.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0.605f, -4.926f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.596f, -0.329f)
                arcTo(4f, 4f, 0f, false, true, 8.5f, 1f)
                moveTo(7.053f, 11.276f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 11f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.474f, 0.658f)
                lineToRelative(-0.28f, 0.842f)
                horizontalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.39f, 0.812f)
                lineToRelative(-2f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.875f, -0.433f)
                lineTo(7.36f, 14f)
                horizontalLineTo(6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.447f, -0.724f)
                close()
            }
        }.build()
        
        return _CloudLightning!!
    }

private var _CloudLightning: ImageVector? = null

