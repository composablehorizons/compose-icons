package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TextHeight: ImageVector
    get() {
        if (_TextHeight != null) return _TextHeight!!
        
        _TextHeight = ImageVector.Builder(
            name = "text-height",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(304f, 32f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 48f)
                verticalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(304f)
                horizontalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(160f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-40f)
                verticalLineTo(112f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(256f, 336f)
                horizontalLineToRelative(-48f)
                verticalLineTo(144f)
                horizontalLineToRelative(48f)
                curveToRelative(14.31f, 0f, 21.33f, -17.31f, 11.31f, -27.31f)
                lineToRelative(-80f, -80f)
                arcToRelative(16f, 16f, 0f, false, false, -22.62f, 0f)
                lineToRelative(-80f, 80f)
                curveTo(379.36f, 126f, 384.36f, 144f, 400f, 144f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(224f)
                horizontalLineToRelative(-48f)
                curveToRelative(-14.31f, 0f, -21.32f, 17.31f, -11.31f, 27.31f)
                lineToRelative(80f, 80f)
                arcToRelative(16f, 16f, 0f, false, false, 22.62f, 0f)
                lineToRelative(80f, -80f)
                curveTo(580.64f, 386f, 575.64f, 368f, 560f, 368f)
                close()
            }
        }.build()
        
        return _TextHeight!!
    }

private var _TextHeight: ImageVector? = null

