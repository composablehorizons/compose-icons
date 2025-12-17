package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BirthdayCake: ImageVector
    get() {
        if (_BirthdayCake != null) return _BirthdayCake!!
        
        _BirthdayCake = ImageVector.Builder(
            name = "birthday-cake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 384f)
                curveToRelative(-28.02f, 0f, -31.26f, -32f, -74.5f, -32f)
                curveToRelative(-43.43f, 0f, -46.825f, 32f, -74.75f, 32f)
                curveToRelative(-27.695f, 0f, -31.454f, -32f, -74.75f, -32f)
                curveToRelative(-42.842f, 0f, -47.218f, 32f, -74.5f, 32f)
                curveToRelative(-28.148f, 0f, -31.202f, -32f, -74.75f, -32f)
                curveToRelative(-43.547f, 0f, -46.653f, 32f, -74.75f, 32f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(16f)
                verticalLineTo(112f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(64f)
                verticalLineTo(112f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(64f)
                verticalLineTo(112f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(16f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 128f)
                horizontalLineTo(0f)
                verticalLineToRelative(-96f)
                curveToRelative(43.356f, 0f, 46.767f, -32f, 74.75f, -32f)
                curveToRelative(27.951f, 0f, 31.253f, 32f, 74.75f, 32f)
                curveToRelative(42.843f, 0f, 47.217f, -32f, 74.5f, -32f)
                curveToRelative(28.148f, 0f, 31.201f, 32f, 74.75f, 32f)
                curveToRelative(43.357f, 0f, 46.767f, -32f, 74.75f, -32f)
                curveToRelative(27.488f, 0f, 31.252f, 32f, 74.5f, 32f)
                verticalLineToRelative(96f)
                close()
                moveTo(96f, 96f)
                curveToRelative(-17.75f, 0f, -32f, -14.25f, -32f, -32f)
                curveToRelative(0f, -31f, 32f, -23f, 32f, -64f)
                curveToRelative(12f, 0f, 32f, 29.5f, 32f, 56f)
                reflectiveCurveToRelative(-14.25f, 40f, -32f, 40f)
                close()
                moveToRelative(128f, 0f)
                curveToRelative(-17.75f, 0f, -32f, -14.25f, -32f, -32f)
                curveToRelative(0f, -31f, 32f, -23f, 32f, -64f)
                curveToRelative(12f, 0f, 32f, 29.5f, 32f, 56f)
                reflectiveCurveToRelative(-14.25f, 40f, -32f, 40f)
                close()
                moveToRelative(128f, 0f)
                curveToRelative(-17.75f, 0f, -32f, -14.25f, -32f, -32f)
                curveToRelative(0f, -31f, 32f, -23f, 32f, -64f)
                curveToRelative(12f, 0f, 32f, 29.5f, 32f, 56f)
                reflectiveCurveToRelative(-14.25f, 40f, -32f, 40f)
                close()
            }
        }.build()
        
        return _BirthdayCake!!
    }

private var _BirthdayCake: ImageVector? = null

