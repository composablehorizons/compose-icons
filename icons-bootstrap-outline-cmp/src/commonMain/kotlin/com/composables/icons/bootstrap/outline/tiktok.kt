package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Tiktok: ImageVector
    get() {
        if (_Tiktok != null) return _Tiktok!!
        
        _Tiktok = ImageVector.Builder(
            name = "tiktok",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 0f)
                horizontalLineToRelative(1.98f)
                curveToRelative(0.144f, 0.715f, 0.54f, 1.617f, 1.235f, 2.512f)
                curveTo(12.895f, 3.389f, 13.797f, 4f, 15f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(-1.753f, 0f, -3.07f, -0.814f, -4f, -1.829f)
                verticalLineTo(11f)
                arcToRelative(5f, 5f, 0f, true, true, -5f, -5f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, true, false, 3f, 3f)
                close()
            }
        }.build()
        
        return _Tiktok!!
    }

private var _Tiktok: ImageVector? = null

