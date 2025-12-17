package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CursorArrowRays: ImageVector
    get() {
        if (_CursorArrowRays != null) return _CursorArrowRays!!
        
        _CursorArrowRays = ImageVector.Builder(
            name = "cursor-arrow-rays",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(11.536f, 2.904f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-1.06f, 1.061f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, -1.06f)
                lineToRelative(1.06f, -1.061f)
                close()
                moveTo(14.5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                close()
                moveTo(4.464f, 9.975f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.061f, 1.06f)
                lineToRelative(-1.06f, 1.061f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.061f, -1.06f)
                lineToRelative(1.06f, -1.061f)
                close()
                moveTo(4.5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                close()
                moveTo(5.525f, 3.964f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.061f)
                lineToRelative(-1.061f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.061f)
                lineToRelative(1.061f, 1.06f)
                close()
                moveTo(8.779f, 7.438f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.368f, 0.366f)
                lineToRelative(-0.396f, 5.283f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.212f, 0.646f)
                lineToRelative(0.602f, -0.474f)
                lineToRelative(0.288f, 1.074f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.449f, -0.388f)
                lineToRelative(-0.288f, -1.075f)
                lineToRelative(0.759f, 0.11f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.726f, -1.165f)
                lineTo(8.78f, 7.438f)
                close()
            }
        }.build()
        
        return _CursorArrowRays!!
    }

private var _CursorArrowRays: ImageVector? = null

