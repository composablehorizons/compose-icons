package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Pallet: ImageVector
    get() {
        if (_Pallet != null) return _Pallet!!
        
        _Pallet = ImageVector.Builder(
            name = "pallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(144f, 256f)
                horizontalLineToRelative(352f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(384f)
                verticalLineToRelative(128f)
                lineToRelative(-64f, -32f)
                lineToRelative(-64f, 32f)
                verticalLineTo(0f)
                horizontalLineTo(144f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                close()
                moveToRelative(480f, 128f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(64f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(608f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(48f)
                close()
                moveToRelative(-336f, 64f)
                horizontalLineTo(128f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(224f, 0f)
                horizontalLineTo(352f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(64f)
                close()
            }
        }.build()
        
        return _Pallet!!
    }

private var _Pallet: ImageVector? = null

