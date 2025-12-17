package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.BarsArrowUp: ImageVector
    get() {
        if (_BarsArrowUp != null) return _BarsArrowUp!!
        
        _BarsArrowUp = ImageVector.Builder(
            name = "bars-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2.75f, 2f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-9.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 2.75f)
                close()
                moveTo(2f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-5.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 6.25f)
                close()
                moveToRelative(0f, 3.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2.75f, 9f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 9.75f)
                close()
                moveTo(9.22f, 9.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineToRelative(-0.97f, -0.97f)
                verticalLineToRelative(5.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(8.56f)
                lineToRelative(-0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                close()
            }
        }.build()
        
        return _BarsArrowUp!!
    }

private var _BarsArrowUp: ImageVector? = null

