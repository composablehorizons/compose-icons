package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Home_work: ImageVector
    get() {
        if (_Home_work != null) return _Home_work!!
        
        _Home_work = ImageVector.Builder(
            name = "home_work",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.17f, 5.7f)
                lineTo(1f, 10.48f)
                verticalLineTo(21f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5f)
                verticalLineTo(10.25f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(17f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                verticalLineToRelative(1.51f)
                lineToRelative(2f, 1.33f)
                lineTo(13.73f, 7f)
                horizontalLineTo(15f)
                verticalLineToRelative(0.85f)
                lineToRelative(2f, 1.34f)
                verticalLineTo(11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                close()
                moveToRelative(9f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Home_work!!
    }

private var _Home_work: ImageVector? = null

