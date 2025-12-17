package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudRainHeavy: ImageVector
    get() {
        if (_CloudRainHeavy != null) return _CloudRainHeavy!!
        
        _CloudRainHeavy = ImageVector.Builder(
            name = "cloud-rain-heavy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.176f, 11.032f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.292f, 0.643f)
                lineToRelative(-1.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.936f, -0.35f)
                lineToRelative(1.5f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.644f, -0.293f)
                moveToRelative(3f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.292f, 0.643f)
                lineToRelative(-1.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.936f, -0.35f)
                lineToRelative(1.5f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.644f, -0.293f)
                moveToRelative(3f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.292f, 0.643f)
                lineToRelative(-1.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.936f, -0.35f)
                lineToRelative(1.5f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.644f, -0.293f)
                moveToRelative(3f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.292f, 0.643f)
                lineToRelative(-1.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.936f, -0.35f)
                lineToRelative(1.5f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.644f, -0.293f)
                moveToRelative(0.229f, -7.005f)
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
            }
        }.build()
        
        return _CloudRainHeavy!!
    }

private var _CloudRainHeavy: ImageVector? = null

