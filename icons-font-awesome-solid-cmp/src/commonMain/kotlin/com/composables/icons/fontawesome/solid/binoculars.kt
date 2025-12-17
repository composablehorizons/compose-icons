package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Binoculars: ImageVector
    get() {
        if (_Binoculars != null) return _Binoculars!!
        
        _Binoculars = ImageVector.Builder(
            name = "binoculars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-64f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(96f)
                verticalLineTo(48f)
                close()
                moveTo(63.91f, 159.99f)
                curveTo(61.4f, 253.84f, 3.46f, 274.22f, 0f, 404f)
                verticalLineToRelative(44f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(288f)
                horizontalLineToRelative(32f)
                verticalLineTo(128f)
                horizontalLineTo(95.84f)
                curveToRelative(-17.63f, 0f, -31.45f, 14.37f, -31.93f, 31.99f)
                close()
                moveToRelative(384.18f, 0f)
                curveToRelative(-0.48f, -17.62f, -14.3f, -31.99f, -31.93f, -31.99f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-44f)
                curveToRelative(-3.46f, -129.78f, -61.4f, -150.16f, -63.91f, -244.01f)
                close()
                moveTo(176f, 32f)
                horizontalLineToRelative(-64f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(96f)
                verticalLineTo(48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveToRelative(48f, 256f)
                horizontalLineToRelative(64f)
                verticalLineTo(128f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Binoculars!!
    }

private var _Binoculars: ImageVector? = null

