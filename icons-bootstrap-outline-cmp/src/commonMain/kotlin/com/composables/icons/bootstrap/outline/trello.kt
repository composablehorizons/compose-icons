package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Trello: ImageVector
    get() {
        if (_Trello != null) return _Trello!!
        
        _Trello = ImageVector.Builder(
            name = "trello",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.1f, 0f)
                horizontalLineTo(1.903f)
                curveTo(0.852f, 0f, 0.002f, 0.85f, 0f, 1.9f)
                verticalLineToRelative(12.19f)
                arcTo(1.9f, 1.9f, 0f, false, false, 1.902f, 16f)
                horizontalLineToRelative(12.199f)
                arcTo(1.9f, 1.9f, 0f, false, false, 16f, 14.09f)
                verticalLineTo(1.9f)
                arcTo(1.9f, 1.9f, 0f, false, false, 14.1f, 0f)
                moveTo(7f, 11.367f)
                arcToRelative(0.636f, 0.636f, 0f, false, true, -0.64f, 0.633f)
                horizontalLineTo(3.593f)
                arcToRelative(0.633f, 0.633f, 0f, false, true, -0.63f, -0.633f)
                verticalLineTo(3.583f)
                curveToRelative(0f, -0.348f, 0.281f, -0.631f, 0.63f, -0.633f)
                horizontalLineToRelative(2.765f)
                curveToRelative(0.35f, 0.002f, 0.632f, 0.284f, 0.633f, 0.633f)
                close()
                moveToRelative(6.052f, -3.5f)
                arcToRelative(0.633f, 0.633f, 0f, false, true, -0.64f, 0.633f)
                horizontalLineToRelative(-2.78f)
                arcTo(0.636f, 0.636f, 0f, false, true, 9f, 7.867f)
                verticalLineTo(3.583f)
                arcToRelative(0.636f, 0.636f, 0f, false, true, 0.633f, -0.633f)
                horizontalLineToRelative(2.778f)
                curveToRelative(0.35f, 0.002f, 0.631f, 0.285f, 0.631f, 0.633f)
                close()
            }
        }.build()
        
        return _Trello!!
    }

private var _Trello: ImageVector? = null

