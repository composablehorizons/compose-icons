package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TriangleHalf: ImageVector
    get() {
        if (_TriangleHalf != null) return _TriangleHalf!!
        
        _TriangleHalf = ImageVector.Builder(
            name = "triangle-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.065f, 2.016f)
                arcTo(0.13f, 0.13f, 0f, false, false, 8.002f, 2f)
                verticalLineToRelative(11.983f)
                lineToRelative(6.856f, 0.017f)
                arcToRelative(0.12f, 0.12f, 0f, false, false, 0.066f, -0.017f)
                arcToRelative(0.2f, 0.2f, 0f, false, false, 0.054f, -0.06f)
                arcToRelative(0.18f, 0.18f, 0f, false, false, -0.002f, -0.183f)
                lineTo(8.12f, 2.073f)
                arcToRelative(0.15f, 0.15f, 0f, false, false, -0.054f, -0.057f)
                close()
                moveToRelative(-1.043f, -0.45f)
                arcToRelative(1.13f, 1.13f, 0f, false, true, 1.96f, 0f)
                lineToRelative(6.856f, 11.667f)
                curveToRelative(0.458f, 0.778f, -0.091f, 1.767f, -0.98f, 1.767f)
                horizontalLineTo(1.146f)
                curveToRelative(-0.889f, 0f, -1.437f, -0.99f, -0.98f, -1.767f)
                close()
            }
        }.build()
        
        return _TriangleHalf!!
    }

private var _TriangleHalf: ImageVector? = null

