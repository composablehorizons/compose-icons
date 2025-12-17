package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BroadcastPin: ImageVector
    get() {
        if (_BroadcastPin != null) return _BroadcastPin!!
        
        _BroadcastPin = ImageVector.Builder(
            name = "broadcast-pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.05f, 3.05f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, 9.9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.707f)
                arcToRelative(8f, 8f, 0f, false, true, 0f, -11.314f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0.707f)
                moveToRelative(2.122f, 2.122f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, 5.656f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, 0.708f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, -7.072f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                moveToRelative(5.656f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 7.072f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -5.656f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                moveToRelative(2.122f, -2.12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 0f, 11.313f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, -0.707f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, -9.9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.707f)
                close()
                moveTo(6f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, 2.5f, 1.937f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(9.937f)
                arcTo(2f, 2f, 0f, false, true, 6f, 8f)
            }
        }.build()
        
        return _BroadcastPin!!
    }

private var _BroadcastPin: ImageVector? = null

