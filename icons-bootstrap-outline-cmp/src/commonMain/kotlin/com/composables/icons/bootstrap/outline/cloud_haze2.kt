package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudHaze2: ImageVector
    get() {
        if (_CloudHaze2 != null) return _CloudHaze2!!
        
        _CloudHaze2 = ImageVector.Builder(
            name = "cloud-haze2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 3f)
                arcToRelative(4f, 4f, 0f, false, false, -3.8f, 2.745f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.949f, -0.313f)
                arcToRelative(5.002f, 5.002f, 0f, false, true, 9.654f, 0.595f)
                arcTo(3f, 3f, 0f, false, true, 13f, 12f)
                horizontalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(13f)
                arcToRelative(2f, 2f, 0f, false, false, 0.001f, -4f)
                horizontalLineToRelative(-0.026f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.445f)
                arcTo(4f, 4f, 0f, false, false, 8.5f, 3f)
                moveTo(0f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 7f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(-2f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _CloudHaze2!!
    }

private var _CloudHaze2: ImageVector? = null

