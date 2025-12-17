package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.GiftTop: ImageVector
    get() {
        if (_GiftTop != null) return _GiftTop!!
        
        _GiftTop = ImageVector.Builder(
            name = "gift-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.25f, 3f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 4.5f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(3.365f)
                arcTo(2.75f, 2.75f, 0f, false, true, 9.25f, 5.362f)
                verticalLineTo(3f)
                close()
                moveTo(2f, 10.75f)
                verticalLineToRelative(4.75f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 17f)
                horizontalLineToRelative(5.75f)
                verticalLineToRelative(-4.876f)
                arcTo(4.75f, 4.75f, 0f, false, true, 5f, 14.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                arcToRelative(3.251f, 3.251f, 0f, false, false, 3.163f, -2.5f)
                horizontalLineTo(2f)
                close()
                moveTo(10.75f, 17f)
                horizontalLineToRelative(5.75f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(-6.163f)
                arcTo(3.251f, 3.251f, 0f, false, false, 15f, 13.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -4.25f, -2.626f)
                verticalLineTo(17f)
                close()
                moveTo(18f, 9.25f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 16.5f, 3f)
                horizontalLineToRelative(-5.75f)
                verticalLineToRelative(2.362f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, 3.885f, 3.888f)
                horizontalLineTo(18f)
                close()
                moveToRelative(-4.496f, -2.755f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, -1.768f, 0f)
                curveToRelative(-0.36f, 0.359f, -0.526f, 0.999f, -0.559f, 1.697f)
                curveToRelative(-0.01f, 0.228f, -0.006f, 0.443f, 0.004f, 0.626f)
                curveToRelative(0.183f, 0.01f, 0.398f, 0.014f, 0.626f, 0.003f)
                curveToRelative(0.698f, -0.033f, 1.338f, -0.2f, 1.697f, -0.559f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, 0f, -1.767f)
                close()
                moveToRelative(-5.24f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, -1.768f, 1.767f)
                curveToRelative(0.36f, 0.36f, 1f, 0.526f, 1.697f, 0.56f)
                curveToRelative(0.228f, 0.01f, 0.443f, 0.006f, 0.626f, -0.004f)
                curveToRelative(0.01f, -0.183f, 0.015f, -0.398f, 0.004f, -0.626f)
                curveToRelative(-0.033f, -0.698f, -0.2f, -1.338f, -0.56f, -1.697f)
                close()
            }
        }.build()
        
        return _GiftTop!!
    }

private var _GiftTop: ImageVector? = null

