package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Copy: ImageVector
    get() {
        if (_Copy != null) return _Copy!!
        
        _Copy = ImageVector.Builder(
            name = "copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(433.941f, 65.941f)
                lineToRelative(-51.882f, -51.882f)
                arcTo(48f, 48f, 0f, false, false, 348.118f, 0f)
                horizontalLineTo(176f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(224f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(80f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(99.882f)
                arcToRelative(48f, 48f, 0f, false, false, -14.059f, -33.941f)
                close()
                moveTo(266f, 464f)
                horizontalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineTo(150f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(74f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(42f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                close()
                moveToRelative(128f, -96f)
                horizontalLineTo(182f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(106f)
                verticalLineToRelative(88f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(202f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                close()
                moveToRelative(6f, -256f)
                horizontalLineToRelative(-64f)
                verticalLineTo(48f)
                horizontalLineToRelative(9.632f)
                curveToRelative(1.591f, 0f, 3.117f, 0.632f, 4.243f, 1.757f)
                lineToRelative(48.368f, 48.368f)
                arcToRelative(6f, 6f, 0f, false, true, 1.757f, 4.243f)
                verticalLineTo(112f)
                close()
            }
        }.build()
        
        return _Copy!!
    }

private var _Copy: ImageVector? = null

