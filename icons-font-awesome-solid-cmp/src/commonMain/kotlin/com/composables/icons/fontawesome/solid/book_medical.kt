package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BookMedical: ImageVector
    get() {
        if (_BookMedical != null) return _BookMedical!!
        
        _BookMedical = ImageVector.Builder(
            name = "book-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 358.4f)
                verticalLineTo(25.6f)
                curveToRelative(0f, -16f, -9.6f, -25.6f, -25.6f, -25.6f)
                horizontalLineTo(96f)
                curveTo(41.6f, 0f, 0f, 41.6f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 54.4f, 41.6f, 96f, 96f, 96f)
                horizontalLineToRelative(326.4f)
                curveToRelative(12.8f, 0f, 25.6f, -9.6f, 25.6f, -25.6f)
                verticalLineToRelative(-16f)
                quadToRelative(0f, -9.6f, -9.6f, -19.2f)
                curveToRelative(-3.2f, -16f, -3.2f, -60.8f, 0f, -73.6f)
                quadToRelative(9.6f, -4.8f, 9.6f, -19.2f)
                close()
                moveTo(144f, 168f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(-56f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-48f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-56f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                close()
                moveToRelative(236.8f, 280f)
                horizontalLineTo(96f)
                curveToRelative(-19.2f, 0f, -32f, -12.8f, -32f, -32f)
                reflectiveCurveToRelative(16f, -32f, 32f, -32f)
                horizontalLineToRelative(284.8f)
                close()
            }
        }.build()
        
        return _BookMedical!!
    }

private var _BookMedical: ImageVector? = null

