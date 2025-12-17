package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Next_week: ImageVector
    get() {
        if (_Next_week != null) return _Next_week!!
        
        _Next_week = ImageVector.Builder(
            name = "next_week",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 20f)
                horizontalLineToRelative(16f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineToRelative(11f)
                close()
                moveToRelative(6f, -8.5f)
                lineToRelative(1f, -1f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
                lineToRelative(-1f, -1f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 18.5f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                lineToRelative(-1f, 1f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(20f, 7f)
                horizontalLineToRelative(-4f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.22f, -1.05f, -0.59f, -1.41f)
                curveTo(15.05f, 3.22f, 14.55f, 3f, 14f, 3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(5f)
                close()
                moveToRelative(10f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(11f)
                close()
            }
        }.build()
        
        return _Next_week!!
    }

private var _Next_week: ImageVector? = null

