package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.StickyNote: ImageVector
    get() {
        if (_StickyNote != null) return _StickyNote!!
        
        _StickyNote = ImageVector.Builder(
            name = "sticky-note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 348.106f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineTo(48f)
                curveTo(21.49f, 32f, 0f, 53.49f, 0f, 80f)
                verticalLineToRelative(351.988f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(268.118f)
                arcToRelative(48f, 48f, 0f, false, false, 33.941f, -14.059f)
                lineToRelative(83.882f, -83.882f)
                arcTo(48f, 48f, 0f, false, false, 448f, 348.106f)
                close()
                moveToRelative(-128f, 80f)
                verticalLineToRelative(-76.118f)
                horizontalLineToRelative(76.118f)
                lineTo(320f, 428.106f)
                close()
                moveTo(400f, 80f)
                verticalLineToRelative(223.988f)
                horizontalLineTo(296f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(104f)
                horizontalLineTo(48f)
                verticalLineTo(80f)
                horizontalLineToRelative(352f)
                close()
            }
        }.build()
        
        return _StickyNote!!
    }

private var _StickyNote: ImageVector? = null

