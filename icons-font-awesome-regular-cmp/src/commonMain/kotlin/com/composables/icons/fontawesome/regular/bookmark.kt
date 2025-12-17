package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) return _Bookmark!!
        
        _Bookmark = ImageVector.Builder(
            name = "bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 0f)
                horizontalLineTo(48f)
                curveTo(21.49f, 0f, 0f, 21.49f, 0f, 48f)
                verticalLineToRelative(464f)
                lineToRelative(192f, -112f)
                lineToRelative(192f, 112f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(0f, 428.43f)
                lineToRelative(-144f, -84f)
                lineToRelative(-144f, 84f)
                verticalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(276f)
                curveToRelative(3.314f, 0f, 6f, 2.683f, 6f, 5.996f)
                verticalLineTo(428.43f)
                close()
            }
        }.build()
        
        return _Bookmark!!
    }

private var _Bookmark: ImageVector? = null

