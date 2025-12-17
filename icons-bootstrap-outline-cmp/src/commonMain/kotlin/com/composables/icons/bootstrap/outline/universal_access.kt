package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.UniversalAccess: ImageVector
    get() {
        if (_UniversalAccess != null) return _UniversalAccess!!
        
        _UniversalAccess = ImageVector.Builder(
            name = "universal-access",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                moveTo(6f, 5.5f)
                lineToRelative(-4.535f, -0.442f)
                arcTo(0.531f, 0.531f, 0f, false, true, 1.531f, 4f)
                horizontalLineTo(14.47f)
                arcToRelative(0.531f, 0.531f, 0f, false, true, 0.066f, 1.058f)
                lineTo(10f, 5.5f)
                verticalLineTo(9f)
                lineToRelative(0.452f, 6.42f)
                arcToRelative(0.535f, 0.535f, 0f, false, true, -1.053f, 0.174f)
                lineTo(8.243f, 9.97f)
                curveToRelative(-0.064f, -0.252f, -0.422f, -0.252f, -0.486f, 0f)
                lineToRelative(-1.156f, 5.624f)
                arcToRelative(0.535f, 0.535f, 0f, false, true, -1.053f, -0.174f)
                lineTo(6f, 9f)
                close()
            }
        }.build()
        
        return _UniversalAccess!!
    }

private var _UniversalAccess: ImageVector? = null

