package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Clone: ImageVector
    get() {
        if (_Clone != null) return _Clone!!
        
        _Clone = ImageVector.Builder(
            name = "clone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 0f)
                horizontalLineTo(144f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(320f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(48f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveTo(362f, 464f)
                horizontalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineTo(150f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(42f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(224f)
                verticalLineToRelative(42f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                close()
                moveToRelative(96f, -96f)
                horizontalLineTo(150f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(308f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(308f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                close()
            }
        }.build()
        
        return _Clone!!
    }

private var _Clone: ImageVector? = null

