package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Forward: ImageVector
    get() {
        if (_Forward != null) return _Forward!!
        
        _Forward = ImageVector.Builder(
            name = "forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.502f, 5.513f)
                arcToRelative(0.144f, 0.144f, 0f, false, false, -0.202f, 0.134f)
                verticalLineTo(6.65f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(2.5f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(6.3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.003f)
                curveToRelative(0f, 0.108f, 0.11f, 0.176f, 0.202f, 0.134f)
                lineToRelative(3.984f, -2.933f)
                lineToRelative(0.042f, -0.028f)
                arcToRelative(0.147f, 0.147f, 0f, false, false, 0f, -0.252f)
                lineToRelative(-0.042f, -0.028f)
                close()
                moveTo(8.3f, 5.647f)
                arcToRelative(1.144f, 1.144f, 0f, false, true, 1.767f, -0.96f)
                lineToRelative(3.994f, 2.94f)
                arcToRelative(1.147f, 1.147f, 0f, false, true, 0f, 1.946f)
                lineToRelative(-3.994f, 2.94f)
                arcToRelative(1.144f, 1.144f, 0f, false, true, -1.767f, -0.96f)
                verticalLineToRelative(-0.503f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3.9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6.3f)
                close()
            }
        }.build()
        
        return _Forward!!
    }

private var _Forward: ImageVector? = null

