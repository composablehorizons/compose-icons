package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Cookie: ImageVector
    get() {
        if (_Cookie != null) return _Cookie!!
        
        _Cookie = ImageVector.Builder(
            name = "cookie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                moveToRelative(4.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveToRelative(-0.5f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(7.96f, 7.96f, 0f, false, false, -4.075f, 1.114f)
                quadToRelative(-0.245f, 0.102f, -0.437f, 0.28f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                moveToRelative(3.25f, 14.201f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.13f, 0.71f)
                arcTo(7f, 7f, 0f, false, true, 8f, 15f)
                arcToRelative(6.97f, 6.97f, 0f, false, true, -3.845f, -1.15f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -2.005f, -2.005f)
                arcTo(6.97f, 6.97f, 0f, false, true, 1f, 8f)
                curveToRelative(0f, -1.953f, 0.8f, -3.719f, 2.09f, -4.989f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 2.469f, -1.574f)
                arcTo(7f, 7f, 0f, false, true, 8f, 1f)
                curveToRelative(1.42f, 0f, 2.742f, 0.423f, 3.845f, 1.15f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 2.005f, 2.005f)
                arcTo(6.97f, 6.97f, 0f, false, true, 15f, 8f)
                curveToRelative(0f, 0.596f, -0.074f, 1.174f, -0.214f, 1.727f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -1.025f, 2.25f)
                arcToRelative(7f, 7f, 0f, false, true, -2.51f, 2.224f)
                close()
            }
        }.build()
        
        return _Cookie!!
    }

private var _Cookie: ImageVector? = null

