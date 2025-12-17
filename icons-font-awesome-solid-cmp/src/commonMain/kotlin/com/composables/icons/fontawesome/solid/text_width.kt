package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TextWidth: ImageVector
    get() {
        if (_TextWidth != null) return _TextWidth!!
        
        _TextWidth = ImageVector.Builder(
            name = "text-width",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(432f, 32f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 48f)
                verticalLineToRelative(80f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(112f)
                horizontalLineToRelative(-24f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(128f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-24f)
                verticalLineTo(112f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(-68.69f, 260.69f)
                curveTo(354f, 283.36f, 336f, 288.36f, 336f, 304f)
                verticalLineToRelative(48f)
                horizontalLineTo(112f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -14.31f, -17.31f, -21.32f, -27.31f, -11.31f)
                lineToRelative(-80f, 80f)
                arcToRelative(16f, 16f, 0f, false, false, 0f, 22.62f)
                lineToRelative(80f, 80f)
                curveTo(94f, 484.64f, 112f, 479.64f, 112f, 464f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(224f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 14.31f, 17.31f, 21.33f, 27.31f, 11.31f)
                lineToRelative(80f, -80f)
                arcToRelative(16f, 16f, 0f, false, false, 0f, -22.62f)
                close()
            }
        }.build()
        
        return _TextWidth!!
    }

private var _TextWidth: ImageVector? = null

