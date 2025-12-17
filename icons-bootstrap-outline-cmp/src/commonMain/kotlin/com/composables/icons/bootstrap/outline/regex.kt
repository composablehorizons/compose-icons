package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Regex: ImageVector
    get() {
        if (_Regex != null) return _Regex!!
        
        _Regex = ImageVector.Builder(
            name = "regex",
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
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, 0.707f)
                moveToRelative(9.9f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 0f, 11.314f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, -0.707f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, -9.9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.707f)
                moveTo(6f, 11f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(5f, -6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(2.117f)
                lineTo(8.257f, 5.57f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.514f, 0.858f)
                lineTo(9.528f, 7.5f)
                lineTo(7.743f, 8.571f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.514f, 0.858f)
                lineTo(10f, 8.383f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineTo(8.383f)
                lineToRelative(1.743f, 1.046f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.514f, -0.858f)
                lineTo(11.472f, 7.5f)
                lineToRelative(1.785f, -1.071f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.514f, -0.858f)
                lineTo(11f, 6.617f)
                close()
            }
        }.build()
        
        return _Regex!!
    }

private var _Regex: ImageVector? = null

