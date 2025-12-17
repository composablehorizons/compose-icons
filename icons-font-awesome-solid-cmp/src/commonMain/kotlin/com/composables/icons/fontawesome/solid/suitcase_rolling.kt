package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SuitcaseRolling: ImageVector
    get() {
        if (_SuitcaseRolling != null) return _SuitcaseRolling!!
        
        _SuitcaseRolling = ImageVector.Builder(
            name = "suitcase-rolling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 160f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(16f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(208f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(-16f, 216f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineTo(72f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(240f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineTo(72f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(240f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveTo(144f, 48f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(48f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineToRelative(-96f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(48f)
                verticalLineTo(48f)
                close()
            }
        }.build()
        
        return _SuitcaseRolling!!
    }

private var _SuitcaseRolling: ImageVector? = null

