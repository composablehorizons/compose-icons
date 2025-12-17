package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudHail: ImageVector
    get() {
        if (_CloudHail != null) return _CloudHail!!
        
        _CloudHail = ImageVector.Builder(
            name = "cloud-hail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.405f, 4.527f)
                arcToRelative(5.001f, 5.001f, 0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0f, true, false, 3.5f, 10.5f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, false, false, 0.405f, -5.973f)
                moveTo(8.5f, 1.5f)
                arcToRelative(4f, 4f, 0f, false, true, 3.976f, 3.555f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.445f)
                horizontalLineTo(13f)
                arcToRelative(2f, 2f, 0f, false, true, -0.001f, 4f)
                horizontalLineTo(3.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0.605f, -4.926f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.596f, -0.329f)
                arcTo(4f, 4f, 0f, false, true, 8.5f, 1.5f)
                moveTo(3.75f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                moveToRelative(0.408f, -3.724f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.632f, -0.316f)
                moveTo(7.75f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                moveToRelative(0.408f, -3.724f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.632f, -0.316f)
                moveToRelative(3.592f, 3.724f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                moveToRelative(0.408f, -3.724f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.632f, -0.316f)
            }
        }.build()
        
        return _CloudHail!!
    }

private var _CloudHail: ImageVector? = null

