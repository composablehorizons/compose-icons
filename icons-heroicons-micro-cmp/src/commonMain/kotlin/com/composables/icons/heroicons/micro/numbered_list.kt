package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.NumberedList: ImageVector
    get() {
        if (_NumberedList != null) return _NumberedList!!
        
        _NumberedList = ImageVector.Builder(
            name = "numbered-list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.995f, 1f)
                arcToRelative(0.625f, 0.625f, 0f, true, false, 0f, 1.25f)
                horizontalLineToRelative(0.38f)
                verticalLineToRelative(2.125f)
                arcToRelative(0.625f, 0.625f, 0f, true, false, 1.25f, 0f)
                verticalLineToRelative(-2.75f)
                arcTo(0.625f, 0.625f, 0f, false, false, 4f, 1f)
                horizontalLineTo(2.995f)
                close()
                moveTo(3.208f, 7.385f)
                arcToRelative(2.37f, 2.37f, 0f, false, true, 1.027f, -0.124f)
                lineTo(2.573f, 8.923f)
                arcToRelative(0.625f, 0.625f, 0f, false, false, 0.439f, 1.067f)
                lineToRelative(1.987f, 0.011f)
                arcToRelative(0.625f, 0.625f, 0f, false, false, 0.006f, -1.25f)
                lineToRelative(-0.49f, -0.003f)
                lineToRelative(0.777f, -0.776f)
                curveToRelative(0.215f, -0.215f, 0.335f, -0.506f, 0.335f, -0.809f)
                curveToRelative(0f, -0.465f, -0.297f, -0.957f, -0.842f, -1.078f)
                arcToRelative(3.636f, 3.636f, 0f, false, false, -1.993f, 0.121f)
                arcToRelative(0.625f, 0.625f, 0f, true, false, 0.416f, 1.179f)
                close()
                moveTo(2.625f, 11f)
                arcToRelative(0.625f, 0.625f, 0f, true, false, 0f, 1.25f)
                horizontalLineTo(4.25f)
                arcToRelative(0.125f, 0.125f, 0f, false, true, 0f, 0.25f)
                horizontalLineTo(3.5f)
                arcToRelative(0.625f, 0.625f, 0f, true, false, 0f, 1.25f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.125f, 0.125f, 0f, false, true, 0f, 0.25f)
                horizontalLineTo(2.625f)
                arcToRelative(0.625f, 0.625f, 0f, true, false, 0f, 1.25f)
                horizontalLineTo(4.25f)
                arcToRelative(1.375f, 1.375f, 0f, false, false, 1.153f, -2.125f)
                arcTo(1.375f, 1.375f, 0f, false, false, 4.25f, 11f)
                horizontalLineTo(2.625f)
                close()
                moveTo(7.25f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7.25f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(6.5f, 13.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _NumberedList!!
    }

private var _NumberedList: ImageVector? = null

