package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PeopleArrows: ImageVector
    get() {
        if (_PeopleArrows != null) return _PeopleArrows!!
        
        _PeopleArrows = ImageVector.Builder(
            name = "people-arrows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 128f)
                arcTo(64f, 64f, 0f, true, false, 32f, 64f)
                arcTo(64f, 64f, 0f, false, false, 96f, 128f)
                close()
                moveToRelative(0f, 176.08f)
                arcToRelative(44.11f, 44.11f, 0f, false, true, 13.64f, -32f)
                lineTo(181.77f, 204f)
                curveToRelative(1.65f, -1.55f, 3.77f, -2.31f, 5.61f, -3.57f)
                arcTo(63.91f, 63.91f, 0f, false, false, 128f, 160f)
                horizontalLineTo(64f)
                arcTo(64f, 64f, 0f, false, false, 0f, 224f)
                verticalLineToRelative(96f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                verticalLineTo(480f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(64f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(383.61f)
                lineToRelative(-50.36f, -47.53f)
                arcTo(44.08f, 44.08f, 0f, false, true, 96f, 304.08f)
                close()
                moveTo(480f, 128f)
                arcToRelative(64f, 64f, 0f, true, false, -64f, -64f)
                arcTo(64f, 64f, 0f, false, false, 480f, 128f)
                close()
                moveToRelative(32f, 32f)
                horizontalLineTo(448f)
                arcToRelative(63.91f, 63.91f, 0f, false, false, -59.38f, 40.42f)
                curveToRelative(1.84f, 1.27f, 4f, 2f, 5.62f, 3.59f)
                lineToRelative(72.12f, 68.06f)
                arcToRelative(44.37f, 44.37f, 0f, false, true, 0f, 64f)
                lineTo(416f, 383.62f)
                verticalLineTo(480f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(64f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(352f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(224f)
                arcTo(64f, 64f, 0f, false, false, 512f, 160f)
                close()
                moveTo(444.4f, 295.34f)
                lineToRelative(-72.12f, -68.06f)
                arcTo(12f, 12f, 0f, false, false, 352f, 236f)
                verticalLineToRelative(36f)
                horizontalLineTo(224f)
                verticalLineTo(236f)
                arcToRelative(12f, 12f, 0f, false, false, -20.28f, -8.73f)
                lineTo(131.6f, 295.34f)
                arcToRelative(12.4f, 12.4f, 0f, false, false, 0f, 17.47f)
                lineToRelative(72.12f, 68.07f)
                arcTo(12f, 12f, 0f, false, false, 224f, 372.14f)
                verticalLineTo(336f)
                horizontalLineTo(352f)
                verticalLineToRelative(36.14f)
                arcToRelative(12f, 12f, 0f, false, false, 20.28f, 8.74f)
                lineToRelative(72.12f, -68.07f)
                arcTo(12.4f, 12.4f, 0f, false, false, 444.4f, 295.34f)
                close()
            }
        }.build()
        
        return _PeopleArrows!!
    }

private var _PeopleArrows: ImageVector? = null

